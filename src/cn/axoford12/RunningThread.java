package cn.axoford12;

public class RunningThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				Thread.sleep(30000);
				Index.Runner();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
