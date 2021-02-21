class Main{
    public static void main(String[] args) {
        VowelCounter string = new VowelCounter("hola mundo");
        System.out.println(string.getString() + " has " + string.getNumberOfVowels());

    }
}