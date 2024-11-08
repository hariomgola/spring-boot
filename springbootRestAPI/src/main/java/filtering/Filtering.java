package filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class Filtering {
	@GetMapping("/filtering")
	public Some_Bean filtering() {
		return new Some_Bean("value 1", "value 2", "value 3");
	}

	@GetMapping("/filtering-list")
	public List<Some_Bean> filteringList() {
		return Arrays.asList(new Some_Bean("value 1", "value 2", "value 3"),
				new Some_Bean("value_1", "value_2", "value_3"), new Some_Bean("value-1", "value-2", "value-3"));
	}

	@GetMapping("/filtering-dynamic")
	public MappingJacksonValue filteringDynamic() {
		Some_Bean some_bean = new Some_Bean("value 1", "value 2", "value 3");
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(some_bean);
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		mappingJacksonValue.setFilters(filters);
		return mappingJacksonValue;
		// return new Some_Bean("value 1", "value 2", "value 3");
	}
}

//@JsonIgnoreProperties({ "field1", "field3" })
@JsonFilter(value = "SomeBeanFilter")
class Some_Bean {
	private String field1;
//	@JsonIgnore
	private String field2;
	private String field3;

	public Some_Bean(String field1, String field2, String field3) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	@Override
	public String toString() {
		return "Some_Bean [field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + "]";
	}

}
