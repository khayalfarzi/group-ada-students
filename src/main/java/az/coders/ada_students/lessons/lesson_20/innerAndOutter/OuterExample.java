package az.coders.ada_students.lessons.lesson_20.innerAndOutter;

public class OuterExample {

    private String outerField;

    public String getOuterField() {
        return outerField;
    }

    public void setOuterField(String outerField) {
        this.outerField = outerField;
    }


    static class InnerExample {

        private String innerField;

        public String getInnerField() {
            return innerField;
        }

        public void setInnerField(String innerField) {
            this.innerField = innerField;
        }
    }
}

class Inner {

}