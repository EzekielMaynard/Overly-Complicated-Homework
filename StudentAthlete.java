package athlete_package;

public abstract class StudentAthlete {
public static enum Gender{MALE,FEMALE};
public static enum Designation{FRESHMAN, SOPHMORE, JUNIOR, SENIOR};
static int eid;
static String fName;
static String lName;
static StudentAthlete.Gender Gender;
static StudentAthlete.Designation Year;

public String getfName() {
	return this.fName;
}public String getlName() {
	return this.lName;
}public int getEid() {
	return this.eid;
}public StudentAthlete.Gender getGender(){
	return this.Gender;
}public StudentAthlete.Designation getYear(){
	return this.Year;
}public void setGender(StudentAthlete.Gender gender){
	gender = StudentAthlete.Gender;
}public void setYear(StudentAthlete.Designation year){
	year = StudentAthlete.Year;
}
public StudentAthlete(String fName, String lName, int eid){
	fName = this.fName;
	lName= this.lName;
	eid = this.eid;
}
	
	
	
}
