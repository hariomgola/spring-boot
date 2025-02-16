const publicKey = "";
const messgaeForEncryption = "";
const RSAEncrypt = new JSEncrypt();
RSAEncrypt.setPublicKey(publicKey);
const encryptedMessage = RSAEncrypt.encrypt(messgaeForEncryption);
