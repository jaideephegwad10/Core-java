class Stationary{

	public static void main(String[] shop){
	
		System.out.println("main started");
		
		String shopName = "Sapna Book House";
		String items[] = {"pen","pencil","eraser","sharpner","scale",
						  "crayons","colour pencil","sketch pen","record","notebook",
						  "compass","paint","book wrapper","glue","calculator",
						  "scissors","stapler","marker","punching machine","paper",
						  "envelops","diary","stamp pad","ink","atlas"};
		System.out.println("The items available in stationary shop are ");
		/*System.out.println(items[0]+","+items[1]+","+items[2]+","+items[3]+","+items[4]+"\n"
							+items[5]+","+items[6]+","+items[7]+","+items[8]+","+items[9]+"\n"
							+items[10]+","+items[11]+","+items[12]+","+items[13]+","+items[14]+"\n"
							+items[15]+","+items[16]+","+items[17]+","+items[18]+","+items[19]+"\n"
							+items[20]+","+items[21]+","+items[22]+","+items[23]+","+items[24]);*/
		
		for(String item : items){
			
			System.out.println(item);
		}
		System.out.println("main ended");
	}
}