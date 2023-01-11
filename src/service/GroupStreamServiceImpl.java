package service;

import java.util.Collections;
import java.util.List;

import comparators.GroupStreamComparator;
import streams.GroupStream;

public class GroupStreamServiceImpl {

    List<GroupStream> Groups;
/* public void SortGroups()
    {        
        Collections.sort(Groups); 
    }*/
    public void sortGroupStreams() {
        Collections.sort(Groups, new GroupStreamComparator());
    }
    
}
