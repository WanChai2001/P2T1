package lab7;

public class classScore {
	int Iad,attend,mid,fi_mal;
	char grade;
	public classScore(int I,int a,int m,int f) {
		this.Iad = I;
		this.attend = a;
		this.mid = m;
		this.fi_mal = f;
	}
	public void setgrade() {
		int setgrade = this.Iad + this.attend + this.mid + this.fi_mal;
		if(setgrade >= 80 ) {
			this.grade = 'A';
		}
		else if (setgrade >= 70) {
			this.grade = 'B';
		}
		else if (setgrade >= 60) {
			this.grade = 'C';
		}
		else if (setgrade >= 50) {
			this.grade = 'D';
		}
		else this.grade = 'F';
}
public String toString() {
	int sumgrade = 0;
	sumgrade = this.Iad + this.attend + this.mid + this.fi_mal;
	String ch = "";
	ch += this.Iad + "\t\t" + this.attend + "\t\t" + this.mid + "\t\t" + this.fi_mal + "\t\t";
	return ch;
}
}