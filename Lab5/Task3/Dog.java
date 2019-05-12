class Dog{
	String name;
	String breed;
	String age;
	public void setDetails(String name, String breed, String age){
		this.name=name;
		this.breed=breed;
		this.age=age;
		}
			



	public void showDetails(){
		if(name.isEmpty() && breed.isEmpty() && age.isEmpty()){
			System.out.print("details are unavailable");
			}
		else
		{
			System.out.println("Name:"+name);
			System.out.println("Breed:"+breed);
			System.out.println("Age:"+age);
		}
	}
}
		