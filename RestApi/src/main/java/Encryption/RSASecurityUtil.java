package Encryption;

import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class RSASecurityUtil {
	private static String publicKey = "";
	private static String privateKey = "";

	// Main Function for Testing the Code
	public static void main(String[] args) {
		try {
			try {
				testingEncyptionDecryption();
			} catch (InvalidKeyException | IllegalBlockSizeException | BadPaddingException | NoSuchPaddingException e) {
				System.out.println("Exception occur while testing the excryption and decryption code");
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	private static void testingEncyptionDecryption()
			throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException {
		try {
			// Code for Encryption
			String encrypt_Data = "Hi I am Data which is encrypted";
			String encrypted_Data = Base64.getEncoder().encodeToString(encrypt(encrypt_Data, publicKey));
			System.out.println("***** Encrypted Data *****\n" + encrypted_Data);

			// Code for Decryption
			String decrypted_Data = RSASecurityUtil.decrypt(encrypted_Data, privateKey);
			System.out.println("***** Decrypted Data *****\n" + decrypted_Data);
		} catch (NoSuchAlgorithmException e) {
			System.err.println(e.getMessage());
		}
	}

	// Main exported decrypt function
	public static String decrypt(String data, String base64PrivateKey) throws IllegalBlockSizeException,
			InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
		return decrypt(Base64.getDecoder().decode(data.getBytes()), getPrivateKey(base64PrivateKey));
	}

	// Function for generating new public key
	private static PublicKey getPublicKey(String base64PublicKey) {
		PublicKey publicKey = null;
		try {
			X509EncodedKeySpec keySpec = new X509EncodedKeySpec(Base64.getDecoder().decode(base64PublicKey.getBytes()));
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			publicKey = keyFactory.generatePublic(keySpec);
			return publicKey;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
		}
		return publicKey;
	}

	// Encrypt function for the encryption
	private static byte[] encrypt(String data, String publicKey) throws BadPaddingException, IllegalBlockSizeException,
			InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException {
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.ENCRYPT_MODE, getPublicKey(publicKey));
		return cipher.doFinal(data.getBytes());
	}

	// decrypt function for Decrypting value
	private static String decrypt(byte[] data, PrivateKey privateKey) throws NoSuchPaddingException,
			NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		return new String(cipher.doFinal(data));
	}

	private static void generatePublicPrivateKey() throws NoSuchAlgorithmException {
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(4096);
		KeyPair keyPair = keyGen.generateKeyPair();
		PublicKey public_key = keyPair.getPublic();
		PrivateKey private_Key = keyPair.getPrivate();
		publicKey= Base64.getEncoder().encodeToString(public_key.getEncoded());
		privateKey= Base64.getEncoder().encodeToString(private_Key.getEncoded());
	}

	// Function for generating new private key
	private static PrivateKey getPrivateKey(String base64PrivateKey) {
		PrivateKey privateKey = null;
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(base64PrivateKey.getBytes()));
		KeyFactory keyFactory = null;
		try {
			keyFactory = KeyFactory.getInstance("RSA");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		try {
			privateKey = keyFactory.generatePrivate(keySpec);
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
		}
		return privateKey;
	}

}
