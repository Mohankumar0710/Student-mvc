package com.selsoft.student_mvc.model;



import jakarta.persistence.*;

@Entity
@Table(name = "student_details")
public class StudentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String grade;
    
    @Column(name = "mobile_number")
    private String mobileNumber;
    
    private String department;
    
    @Column(name = "school_name_sslc")
    private String schoolNameSSLC;
    
    @Column(name = "year_of_passing_sslc")
    private String yearOfPassingSSLC;
    
    @Column(name = "percentage_sslc")
    private String percentageSSLC;
    
    @Column(name = "school_name_hsc")
    private String schoolNameHSC;
    
    @Column(name = "year_of_passing_hsc")
    private String yearOfPassingHSC;
    
    @Column(name = "percentage_hsc")
    private String percentageHSC;
    
    @Column(name = "school_name_ug")
    private String schoolNameUG;
    
    @Column(name = "year_of_passing_ug")
    private String yearOfPassingUG;
    
    @Column(name = "percentage_ug")
    private String percentageUG;
    
    @Column(name = "school_name_pg")
    private String schoolNamePG;
    
    @Column(name = "year_of_passing_pg")
    private String yearOfPassingPG;
    
    @Column(name = "percentage_pg")
    private String percentagePG;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSchoolNameSSLC() {
        return schoolNameSSLC;
    }

    public void setSchoolNameSSLC(String schoolNameSSLC) {
        this.schoolNameSSLC = schoolNameSSLC;
    }

    public String getYearOfPassingSSLC() {
        return yearOfPassingSSLC;
    }

    public void setYearOfPassingSSLC(String yearOfPassingSSLC) {
        this.yearOfPassingSSLC = yearOfPassingSSLC;
    }

    public String getPercentageSSLC() {
        return percentageSSLC;
    }

    public void setPercentageSSLC(String percentageSSLC) {
        this.percentageSSLC = percentageSSLC;
    }

    public String getSchoolNameHSC() {
        return schoolNameHSC;
    }

    public void setSchoolNameHSC(String schoolNameHSC) {
        this.schoolNameHSC = schoolNameHSC;
    }

    public String getYearOfPassingHSC() {
        return yearOfPassingHSC;
    }

    public void setYearOfPassingHSC(String yearOfPassingHSC) {
        this.yearOfPassingHSC = yearOfPassingHSC;
    }

    public String getPercentageHSC() {
        return percentageHSC;
    }

    public void setPercentageHSC(String percentageHSC) {
        this.percentageHSC = percentageHSC;
    }

    public String getSchoolNameUG() {
        return schoolNameUG;
    }

    public void setSchoolNameUG(String schoolNameUG) {
        this.schoolNameUG = schoolNameUG;
    }

    public String getYearOfPassingUG() {
        return yearOfPassingUG;
    }

    public void setYearOfPassingUG(String yearOfPassingUG) {
        this.yearOfPassingUG = yearOfPassingUG;
    }

    public String getPercentageUG() {
        return percentageUG;
    }

    public void setPercentageUG(String percentageUG) {
        this.percentageUG = percentageUG;
    }

    public String getSchoolNamePG() {
        return schoolNamePG;
    }

    public void setSchoolNamePG(String schoolNamePG) {
        this.schoolNamePG = schoolNamePG;
    }

    public String getYearOfPassingPG() {
        return yearOfPassingPG;
    }

    public void setYearOfPassingPG(String yearOfPassingPG) {
        this.yearOfPassingPG = yearOfPassingPG;
    }

    public String getPercentagePG() {
        return percentagePG;
    }

    public void setPercentagePG(String percentagePG) {
        this.percentagePG = percentagePG;
    }

    @Override
    public String toString() {
        return "StudentDetails [id=" + id + ", name=" + name + ", grade=" + grade + ", mobileNumber=" + mobileNumber
                + ", department=" + department + ", schoolNameSSLC=" + schoolNameSSLC + ", yearOfPassingSSLC=" + yearOfPassingSSLC
                + ", percentageSSLC=" + percentageSSLC + ", schoolNameHSC=" + schoolNameHSC + ", yearOfPassingHSC=" + yearOfPassingHSC
                + ", percentageHSC=" + percentageHSC + ", schoolNameUG=" + schoolNameUG + ", yearOfPassingUG=" + yearOfPassingUG
                + ", percentageUG=" + percentageUG + ", schoolNamePG=" + schoolNamePG + ", yearOfPassingPG=" + yearOfPassingPG
                + ", percentagePG=" + percentagePG + "]";
    }
}
