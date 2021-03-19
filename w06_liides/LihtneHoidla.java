package w06_liides;

class LihtneHoidla implements Hoidla{
	int hetkeSumma=0;
	public void lisa(int kogus){hetkeSumma+=kogus;}
	public int kysiSumma(){return hetkeSumma;}
}