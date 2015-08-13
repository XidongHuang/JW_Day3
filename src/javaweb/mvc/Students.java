package javaweb.mvc;

public class Students {
	private Integer flowId;
	private int type;
	private String idCard;
	private String examCard;
	private String studentName;
	private String location;
	private int grade;
	public Integer getFlowId() {
		return flowId;
	}
	public void setFlowId(Integer flowId) {
		this.flowId = flowId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getExamCard() {
		return examCard;
	}
	public void setExamCard(String examCard) {
		this.examCard = examCard;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String stduentName) {
		this.studentName = stduentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Students [flowId=" + flowId + ", type=" + type + ", idCard=" + idCard + ", examCard=" + examCard
				+ ", stduentName=" + studentName + ", location=" + location + ", grade=" + grade + "]";
	}
	public Students(Integer flowId, int type, String idCard, String examCard, String stduentName, String location,
			int grade) {
		super();
		this.flowId = flowId;
		this.type = type;
		this.idCard = idCard;
		this.examCard = examCard;
		this.studentName = stduentName;
		this.location = location;
		this.grade = grade;
	}
	public Students() {
		super();
	}
	
	
	
	
}
