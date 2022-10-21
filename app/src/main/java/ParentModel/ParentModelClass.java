package ParentModel;

import java.util.List;

import ChildModel.ChildModelClass;

public class ParentModelClass {
     String title;
     List<ChildModelClass> ChildModelClassList;

     public ParentModelClass(String title, List<ChildModelClass> childModelClassList) {
          this.title = title;
          ChildModelClassList = childModelClassList;
     }
}
