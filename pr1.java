class Demo{
	
	void fun(){
		System.out.println("in fun");
	}

	 void run(){
		System.out.println("in run");
	}

	public static void main(String[] args){

		System.out.println("in main");
		
		Demo obj=new Demo();
		obj.fun();
		obj.run();
	}
}
