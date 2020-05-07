Class FirstNonrepeatingInteger{

public static void main(String args[])
{
int a[]={2, 1, 3, 5, 3, 2};
int nonrepeatingvalue =  firstDuplicate(a);
if(a==-1)
System.out.println("array has no non repeating characters");
else
System.out.println("First non repeating character: "nonrepeatingvalue);

}
static int firstDuplicate(int[] a) {
HashSet<Integer> nonrep = new HashSet<>();
for(int j:a)
{
    if(nonrep.contains(j))
        return j;
        else
        nonrep.add(j);
}
return -1;
}
}
