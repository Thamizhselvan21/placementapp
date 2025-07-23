package day1;

public class Placement {
	private int pid;
	private String job;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Placement [pid=" + pid + ", job=" + job + "]";
	}
	
}
