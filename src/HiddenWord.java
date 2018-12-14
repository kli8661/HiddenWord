public class HiddenWord {

    private String field;

    public HiddenWord(String field)
    {
        this.field = field;
    }

    public String getHint(String input)
    {
        String output = "";
        for(int i = 0; i < field.length(); i++)
        {
            String a = input.substring(i,i+1);
            String b = field.substring(i,i+1);
            if(a.equals(b))
            {
                output+=a;
            }
            else if(b.contains(a))
            {
                output+="+";
            }
            else
            {
                output+="*";
            }
        }
        return output;
    }
}
