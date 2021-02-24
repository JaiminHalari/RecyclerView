package james.my.recyclerviewdemo;

public class MyDataLists {

    private int MainImage;
    private String Name;
    private String Description;
    private int SubImage;

    public MyDataLists(int mainImage, String name, String description, int subImage) {
        MainImage = mainImage;
        Name = name;
        Description = description;
        SubImage = subImage;
    }

    public int getMainImage() {
        return MainImage;
    }

    public void setMainImage(int mainImage) {
        MainImage = mainImage;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getSubImage() {
        return SubImage;
    }

    public void setSubImage(int subImage) {
        SubImage = subImage;
    }
}
