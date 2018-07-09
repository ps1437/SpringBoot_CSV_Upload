package com.wipro.piramal.vo;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;

import com.wipro.piramal.util.BulkConstant;
import com.wipro.piramal.validator.ValidInput;

/**
 * @author Praveen $oni 
 */
public class OfferVo {

	/** The identifier. */
	@NotNull
	@NumberFormat
	private long identifier;

	/** The appl no. */
	@NotNull
	@NumberFormat
	private long applNo;

	/** The legal entity. */
	private String legalEntity;

	/** The band. */
	@ValidInput(expectedValue = BulkConstant.VALID_BAND, message = "{offers.band}")
	private String band;

	/** The grade. */
	@ValidInput(expectedValue = BulkConstant.VALID_GRADE, message = "{offers.grade}")
	private String grade;

	/** The pay basis. */
	@ValidInput(expectedValue = BulkConstant.VALID_PAY, message = "{msg.payBasis}")
	private String payBasis;

	/** The start date. */
	private String startDate;

	/** The fixed pay. */
	@NumberFormat
	private long fixedPay;

	/** The loyalaity. */
	@NumberFormat
	private long loyalaity;

	/** The currency. */
	@ValidInput(expectedValue = BulkConstant.VALID_CURRENCY, message = "{msg.currency}")
	private String currency;

	/** The basic. */
	@NumberFormat
	private long basic;

	/** The petrol allowance. */
	@NumberFormat
	private long petrolAllowance;

	/** The car allowance. */
	@NumberFormat
	private long carAllowance;

	/** The joining bonus. */
	@NumberFormat
	private long joiningBonus;

	/** The lta. */
	@NumberFormat
	private long lta;

	/** The expiration date. */
	private String expirationDate;

	/** The medical. */
	@NumberFormat
	private long medical;

	/** The statutory bonus. */
	@NumberFormat
	private long statutoryBonus;

	/** The special allowance. */
	@NumberFormat
	private long specialAllowance;

	/** The ctc. */
	@NumberFormat
	private long ctc;

	/** The tribal area allowance. */
	@NumberFormat
	private long tribalAreaAllowance;

	/** The driver salary. */
	@NumberFormat
	private long driverSalary;

	/** The performance pay. */
	@NumberFormat
	private long performancePay;

	/** The edu allowance. */
	@NumberFormat
	private long eduAllowance;

	/** The pgl bonus. */
	@NumberFormat
	private long pglBonus;

	/** The health coverage. */
	@NumberFormat
	private long healthCoverage;

	/** The conveyance. */
	@NumberFormat
	private long conveyance;

	/** The gratuity. */
	@NumberFormat
	private long gratuity;

	/** The pf. */
	@NumberFormat
	private long pf;

	/** The car parking and cleaning. */
	@NumberFormat
	private long carParkingAndCleaning;

	/** The relocation desc. */
	@ValidInput(expectedValue = "Yes,No", message = "{offers.relocation}")
	private String relocationDesc;

	/** The letter used. */
	@ValidInput(expectedValue = BulkConstant.VALID_LETTERS, message = "{offers.letters}")
	private String letterUsed;

	public String getLetterUsed() {
		return letterUsed;
	}

	public void setLetterUsed(String letterUsed) {
		this.letterUsed = letterUsed;
	}

	/** The hra. */
	@NumberFormat
	private long hra;

	/** The hiring manager title. */
	private String hiringManagerTitle;

	/** The comments. */
	private String comments;

	/**
	 * Gets the identifier.
	 *
	 * @return the identifier
	 */
	public long getIdentifier() {
		return identifier;
	}

	/**
	 * Sets the identifier.
	 *
	 * @param identifier
	 *            the new identifier
	 */
	public void setIdentifier(long identifier) {
		this.identifier = identifier;
	}

	/**
	 * Gets the appl no.
	 *
	 * @return the appl no
	 */
	public long getApplNo() {
		return applNo;
	}

	/**
	 * Sets the appl no.
	 *
	 * @param applNo
	 *            the new appl no
	 */
	public void setApplNo(long applNo) {
		this.applNo = applNo;
	}

	/**
	 * Gets the legal entity.
	 *
	 * @return the legal entity
	 */
	public String getLegalEntity() {
		return legalEntity;
	}

	/**
	 * Sets the legal entity.
	 *
	 * @param legalEntity
	 *            the new legal entity
	 */
	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	/**
	 * Gets the band.
	 *
	 * @return the band
	 */
	public String getBand() {
		return band;
	}

	/**
	 * Sets the band.
	 *
	 * @param band
	 *            the new band
	 */
	public void setBand(String band) {
		this.band = band;
	}

	/**
	 * Gets the grade.
	 *
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * Sets the grade.
	 *
	 * @param grade
	 *            the new grade
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * Gets the pay basis.
	 *
	 * @return the pay basis
	 */
	public String getPayBasis() {
		return payBasis;
	}

	/**
	 * Sets the pay basis.
	 *
	 * @param payBasis
	 *            the new pay basis
	 */
	public void setPayBasis(String payBasis) {
		this.payBasis = payBasis;
	}

	/**
	 * Gets the start date.
	 *
	 * @return the start date
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date.
	 *
	 * @param startDate
	 *            the new start date
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the fixed pay.
	 *
	 * @return the fixed pay
	 */
	public long getFixedPay() {
		return fixedPay;
	}

	/**
	 * Sets the fixed pay.
	 *
	 * @param fixedPay
	 *            the new fixed pay
	 */
	public void setFixedPay(long fixedPay) {
		this.fixedPay = fixedPay;
	}

	/**
	 * Gets the loyalaity.
	 *
	 * @return the loyalaity
	 */
	public long getLoyalaity() {
		return loyalaity;
	}

	/**
	 * Sets the loyalaity.
	 *
	 * @param loyalaity
	 *            the new loyalaity
	 */
	public void setLoyalaity(long loyalaity) {
		this.loyalaity = loyalaity;
	}

	/**
	 * Gets the currency.
	 *
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Sets the currency.
	 *
	 * @param currency
	 *            the new currency
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * Gets the basic.
	 *
	 * @return the basic
	 */
	public long getBasic() {
		return basic;
	}

	/**
	 * Sets the basic.
	 *
	 * @param basic
	 *            the new basic
	 */
	public void setBasic(long basic) {
		this.basic = basic;
	}

	/**
	 * Gets the petrol allowance.
	 *
	 * @return the petrol allowance
	 */
	public long getPetrolAllowance() {
		return petrolAllowance;
	}

	/**
	 * Sets the petrol allowance.
	 *
	 * @param petrolAllowance
	 *            the new petrol allowance
	 */
	public void setPetrolAllowance(long petrolAllowance) {
		this.petrolAllowance = petrolAllowance;
	}

	/**
	 * Gets the car allowance.
	 *
	 * @return the car allowance
	 */
	public long getCarAllowance() {
		return carAllowance;
	}

	/**
	 * Sets the car allowance.
	 *
	 * @param carAllowance
	 *            the new car allowance
	 */
	public void setCarAllowance(long carAllowance) {
		this.carAllowance = carAllowance;
	}

	/**
	 * Gets the joining bonus.
	 *
	 * @return the joining bonus
	 */
	public long getJoiningBonus() {
		return joiningBonus;
	}

	/**
	 * Sets the joining bonus.
	 *
	 * @param joiningBonus
	 *            the new joining bonus
	 */
	public void setJoiningBonus(long joiningBonus) {
		this.joiningBonus = joiningBonus;
	}

	/**
	 * Gets the lta.
	 *
	 * @return the lta
	 */
	public long getLta() {
		return lta;
	}

	/**
	 * Sets the lta.
	 *
	 * @param lta
	 *            the new lta
	 */
	public void setLta(long lta) {
		this.lta = lta;
	}

	/**
	 * Gets the expiration date.
	 *
	 * @return the expiration date
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * Sets the expiration date.
	 *
	 * @param expirationDate
	 *            the new expiration date
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * Gets the medical.
	 *
	 * @return the medical
	 */
	public long getMedical() {
		return medical;
	}

	/**
	 * Sets the medical.
	 *
	 * @param medical
	 *            the new medical
	 */
	public void setMedical(long medical) {
		this.medical = medical;
	}

	/**
	 * Gets the statutory bonus.
	 *
	 * @return the statutory bonus
	 */
	public long getStatutoryBonus() {
		return statutoryBonus;
	}

	/**
	 * Sets the statutory bonus.
	 *
	 * @param statutoryBonus
	 *            the new statutory bonus
	 */
	public void setStatutoryBonus(long statutoryBonus) {
		this.statutoryBonus = statutoryBonus;
	}

	/**
	 * Gets the special allowance.
	 *
	 * @return the special allowance
	 */
	public long getSpecialAllowance() {
		return specialAllowance;
	}

	/**
	 * Sets the special allowance.
	 *
	 * @param specialAllowance
	 *            the new special allowance
	 */
	public void setSpecialAllowance(long specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	/**
	 * Gets the ctc.
	 *
	 * @return the ctc
	 */
	public long getCtc() {
		return ctc;
	}

	/**
	 * Sets the ctc.
	 *
	 * @param ctc
	 *            the new ctc
	 */
	public void setCtc(long ctc) {
		this.ctc = ctc;
	}

	/**
	 * Gets the tribal area allowance.
	 *
	 * @return the tribal area allowance
	 */
	public long getTribalAreaAllowance() {
		return tribalAreaAllowance;
	}

	/**
	 * Sets the tribal area allowance.
	 *
	 * @param tribalAreaAllowance
	 *            the new tribal area allowance
	 */
	public void setTribalAreaAllowance(long tribalAreaAllowance) {
		this.tribalAreaAllowance = tribalAreaAllowance;
	}

	/**
	 * Gets the driver salary.
	 *
	 * @return the driver salary
	 */
	public long getDriverSalary() {
		return driverSalary;
	}

	/**
	 * Sets the driver salary.
	 *
	 * @param driverSalary
	 *            the new driver salary
	 */
	public void setDriverSalary(long driverSalary) {
		this.driverSalary = driverSalary;
	}

	/**
	 * Gets the performance pay.
	 *
	 * @return the performance pay
	 */
	public long getPerformancePay() {
		return performancePay;
	}

	/**
	 * Sets the performance pay.
	 *
	 * @param performancePay
	 *            the new performance pay
	 */
	public void setPerformancePay(long performancePay) {
		this.performancePay = performancePay;
	}

	/**
	 * Gets the edu allowance.
	 *
	 * @return the edu allowance
	 */
	public long getEduAllowance() {
		return eduAllowance;
	}

	/**
	 * Sets the edu allowance.
	 *
	 * @param eduAllowance
	 *            the new edu allowance
	 */
	public void setEduAllowance(long eduAllowance) {
		this.eduAllowance = eduAllowance;
	}

	/**
	 * Gets the pgl bonus.
	 *
	 * @return the pgl bonus
	 */
	public long getPglBonus() {
		return pglBonus;
	}

	/**
	 * Sets the pgl bonus.
	 *
	 * @param pglBonus
	 *            the new pgl bonus
	 */
	public void setPglBonus(long pglBonus) {
		this.pglBonus = pglBonus;
	}

	/**
	 * Gets the health coverage.
	 *
	 * @return the health coverage
	 */
	public long getHealthCoverage() {
		return healthCoverage;
	}

	/**
	 * Sets the health coverage.
	 *
	 * @param healthCoverage
	 *            the new health coverage
	 */
	public void setHealthCoverage(long healthCoverage) {
		this.healthCoverage = healthCoverage;
	}

	/**
	 * Gets the conveyance.
	 *
	 * @return the conveyance
	 */
	public long getConveyance() {
		return conveyance;
	}

	/**
	 * Sets the conveyance.
	 *
	 * @param conveyance
	 *            the new conveyance
	 */
	public void setConveyance(long conveyance) {
		this.conveyance = conveyance;
	}

	/**
	 * Gets the gratuity.
	 *
	 * @return the gratuity
	 */
	public long getGratuity() {
		return gratuity;
	}

	/**
	 * Sets the gratuity.
	 *
	 * @param gratuity
	 *            the new gratuity
	 */
	public void setGratuity(long gratuity) {
		this.gratuity = gratuity;
	}

	/**
	 * Gets the pf.
	 *
	 * @return the pf
	 */
	public long getPf() {
		return pf;
	}

	/**
	 * Sets the pf.
	 *
	 * @param pf
	 *            the new pf
	 */
	public void setPf(long pf) {
		this.pf = pf;
	}

	/**
	 * Gets the car parking and cleaning.
	 *
	 * @return the car parking and cleaning
	 */
	public long getCarParkingAndCleaning() {
		return carParkingAndCleaning;
	}

	/**
	 * Sets the car parking and cleaning.
	 *
	 * @param carParkingAndCleaning
	 *            the new car parking and cleaning
	 */
	public void setCarParkingAndCleaning(long carParkingAndCleaning) {
		this.carParkingAndCleaning = carParkingAndCleaning;
	}

	/**
	 * Gets the relocation desc.
	 *
	 * @return the relocation desc
	 */
	public String getRelocationDesc() {
		return relocationDesc;
	}

	/**
	 * Sets the relocation desc.
	 *
	 * @param relocationDesc
	 *            the new relocation desc
	 */
	public void setRelocationDesc(String relocationDesc) {
		this.relocationDesc = relocationDesc;
	}

	/**
	 * Gets the hra.
	 *
	 * @return the hra
	 */
	public long getHra() {
		return hra;
	}

	/**
	 * Sets the hra.
	 *
	 * @param hra
	 *            the new hra
	 */
	public void setHra(long hra) {
		this.hra = hra;
	}

	/**
	 * Gets the hiring manager title.
	 *
	 * @return the hiring manager title
	 */
	public String getHiringManagerTitle() {
		return hiringManagerTitle;
	}

	/**
	 * Sets the hiring manager title.
	 *
	 * @param hiringManagerTitle
	 *            the new hiring manager title
	 */
	public void setHiringManagerTitle(String hiringManagerTitle) {
		this.hiringManagerTitle = hiringManagerTitle;
	}

	/**
	 * Gets the comments.
	 *
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * Sets the comments.
	 *
	 * @param comments
	 *            the new comments
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}



}
