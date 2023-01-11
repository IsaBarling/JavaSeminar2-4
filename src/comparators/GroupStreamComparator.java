package comparators;

import streams.GroupStream;
import java.util.Comparator;


public class GroupStreamComparator implements Comparator<GroupStream>{
    public int compare (GroupStream gs1, GroupStream gs2) throws ClassCastException
    {
        int count1 = gs1.StundentGroups.size();
        int count2 = gs2.StundentGroups.size();

  

        if(count1 == count2)
        return 0;
        else if (count1 > count2)
        return 1;
        else
        return -1;

    }
    
}
