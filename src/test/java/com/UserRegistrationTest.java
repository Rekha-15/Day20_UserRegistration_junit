package com;

import org.junit.Assert;
import org.junit.Test;

import com.UserRegistration_junit.UserRegistration;

public class UserRegistrationTest {
	
	// FirstName
	/**
	 * @method testValidateFirstName test True case for first name
	 * @Test take a correct input where first latter is Cap
	 * @return true
	 */

	@Test
	public void testValidateFirstName() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateFirstName("Rekha");
		Assert.assertEquals(true, result);
	}

	/**
	 * @method testInvalidFirstName test false case for first name
	 * @Test take a wrong input where first latter is not Cap and adding number
	 * @return false
	 */

	@Test
	public void testInvalidFirstName() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateFirstName("abc1");
		Assert.assertEquals(false, result);
	}

	/**
	 * @method testShortFirstName test false case for first name
	 * @Test take a wrong input where first latter is not Cap and we take only two
	 *       Character
	 * @return false
	 */

	@Test
	public void testShortFirstName() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateFirstName("ab");
		Assert.assertEquals(false, result);
	}

	// LastName
	/**
	 * @method testValidateLastName test true case for last name
	 * @Test take a correct input where first latter is Cap
	 * @return true
	 */

	@Test
	public void testValidateLastName() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("Patil");
		Assert.assertEquals(true, result);
	}

	/**
	 * @method testInvalidLastName test false case for last name
	 * @Test take a wrong input where first latter is not Cap
	 * @return false
	 */

	@Test
	public void testInvalidLastName() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("rEK");
		Assert.assertEquals(false, result);
	}

	/**
	 * @method testShortLastName test false case for last name
	 * @Test take a wrong input where first latter is not Cap and we take only two
	 *       Character
	 * @return false
	 */

	@Test
	public void testShortLastName() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("re");
		Assert.assertEquals(false, result);
	}
	
	//email id
	
	/**
	 * @method testvalidateEmail test true case for email id
	 * @Test take a correct input 
	 * @return true
	 */
	@Test
	public void testvalidateEmail() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("rekhapatil.1509@gmail.com");
		Assert.assertEquals(true, result);
	}
	
	/**
	 * @method testanothervalidateEmail test true case for email id
	 * @Test take a correct input 
	 * @return true
	 */
	
	@Test
	public void testanothervalidateEmail() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("rekha15patil@gmail.com");
		Assert.assertEquals(true, result);
	}

	/**
	 * @method testInvalidEmail test false case for email id
	 * @Test taking a wrong input where there is no .com
	 * @return false
	 */
	
	@Test
	public void testInvalidEmail() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("rekhapatil.1509@gmail.");
		Assert.assertEquals(false, result);
	}
	
	/**
	 * @method testInvalidEmail test false case for email id
	 * @Test taking a wrong input where there is no gmail  @gmail.com 
	 * @return false
	 */
	
	@Test
	public void testNoextensionInvalidEmail() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("rekhapatil.1509");
		Assert.assertEquals(false, result);
	}
	
	/**
	 * @method testNospecialCharInvalidEmail test false case for email id
	 * @Test taking a wrong input where there is no special char i.e @
	 * @return false
	 */
	
	@Test
	public void testNospecialCharInvalidEmail() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("rekhapatil.1509gmail.com");
		Assert.assertEquals(false, result);
	}
		

	// Phone Number
	/**
	 * @method testValidPhoneNumber test true case for phoneNo
	 * @Test take right input where we mention country code then a space and then 10
	 *       digit phoneNo
	 * @return true
	 */

	@Test
	public void testValidPhoneNumber() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePhoneNumber("91 8095592954");
		Assert.assertEquals(true, result);
	}

	/**
	 * @method testInvalidNoSpacePhoneNumber test false case for phoneNo
	 * @Test take wrong input where we mention country code but donot give a space
	 *       between country code and 10 digit phoneNo
	 * @return false
	 */

	@Test
	public void testInvalidNoSpacePhoneNumber() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePhoneNumber("919090909090");
		Assert.assertEquals(false, result);
	}

	/**
	 * @method testInvalidShortPhoneNumber test sad case for phoneNo
	 * @Test take wrong input where we mention country code then a space and then
	 *       less then 10 digit phoneNo
	 * @return false
	 */

	@Test
	public void testInvalidShortPhoneNumber() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePhoneNumber("89 89898989");
		Assert.assertEquals(false, result);
	}

	/**
	 * @method testInvalidShortPhoneNumber test sad case for phoneNo
	 * @Test take wrong input where we mention 10 digit phoneNo without country code
	 * @return false
	 */

	@Test
	public void testInvalidWithoutCountryCodePhoneNumber() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePhoneNumber("87100973678");
		Assert.assertEquals(false, result);
	}
// Password
	/**
	 * @method testvalidPassword test true case for phoneNo
	 * @test (follow all the 4 rules) Rule-1 Minimum 8 character Rule-2 At least one
	 *       Upper case Rule-3 At least one Numeric value Rule-4 at least one
	 *       Special character
	 * @return true
	 */

	@Test
	public void testValidPassword() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("Rekha15@");
		Assert.assertEquals(true, result);
	}

	/**
	 * @method testvalidPassword test false case for phoneNo
	 * @test skip Rule1 Rule-1 Minimum 8 character Rule-2 At least one Upper case
	 *       Rule-3 At least one Numeric value Rule-4 at least one Special character
	 * @return false
	 */

	@Test
	public void testInvalidShortPassword() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("rek15@");
		Assert.assertEquals(false, result);
	}

	/**
	 * @method testvalidPassword test false case for phoneNo
	 * @test skip Rule2 Rule-1 Minimum 8 character Rule-2 At least one Upper case
	 *       Rule-3 At least one Numeric value Rule-4 at least one Special character
	 * @return false
	 */

	@Test
	public void testInvalidSkipUpperCasePassword() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("15rekha@");
		Assert.assertEquals(false, result);
	}

	/**
	 * @method testvalidPassword test false case for phoneNo
	 * @test skip Rule3 Rule-1 Minimum 8 character Rule-2 At least one Upper case
	 *       Rule-3 At least one Numeric value Rule-4 at least one Special character
	 * @return false
	 */

	@Test
	public void testInvalidSkipNumericValuePassword() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("rekha@");
		Assert.assertEquals(false, result);
	}

	/**
	 * @method testvalidPassword test sad case for phoneNo
	 * @test skip Rule4 Rule-1 Minimum 8 character Rule-2 At least one Upper case
	 *       Rule-3 At least one Numeric value Rule-4 at least one Special character
	 * @return false
	 */

	@Test
	public void testInvalidSkipSpecialCharacterPassword() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("Rekhapatil5");
		Assert.assertEquals(false, result);
	}
}
