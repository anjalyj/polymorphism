class BedRoom extends Room{
   int height;
  public BedRoom(int length,int width ,int height){
    super(length,width);
    this.height = height;
  }

  public int volume(){
    return length*width*height;
  }
}
