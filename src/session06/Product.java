package session06;

public class Product {
    private String idProduct ;
    private String nameProduct ;
    private int priceProduct ;

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
       if(priceProduct > 0){
           this.priceProduct = priceProduct;
           System.out.println(" cập nhật giá thành công");
       }else {
           System.out.println(" cập nhật giá ko thành công");
       }
    }
    public void printInfo(){
        System.out.println("mã sản phẩm: "+idProduct +"\n"+"tên sản phảm: "+nameProduct+"\n"+"giá sản phảm: "+priceProduct +"\n");
    }
    public Product(String idProduct, String nameProduct, int priceProduct){
        this.idProduct=idProduct;
        this.nameProduct=nameProduct;
        this.priceProduct=priceProduct;
    }

}
