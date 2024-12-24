class main{
    int age;
    main(int age)
    {
       this.age=age;
}
public static void main(String[] args){
    main obj=new main(16);
    System.out.println("my age is "+obj.age);
}
}