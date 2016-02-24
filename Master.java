class Master{
  public static void main(String[] args) {
    BedRoom r1 = new BedRoom(10,20,50);
    int a = r1.area();
    int v = r1.volume();
    System.out.println("Area is"+a);
    System.out.println("Volume is"+v);
  }
}
