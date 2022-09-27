public class ReadOnly {
    private String name = "Wiktoria";
    public String getName() {
        name = name + "jest tutaj! ";
        return name;
    }

}
