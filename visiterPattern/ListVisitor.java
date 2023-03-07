package visiterPattern;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    
    @Override
    public void visit(Directory directory) {
        System.out.println("Directory " + directory);

        try {
            Iterator<Entry> iterator = directory.iterator();
            while(iterator.hasNext()) {
                Entry entry = iterator.next();
                entry.accept(this);
            }
        } catch (FileTreatmentException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void visit(File file) {
        System.out.println("File " + file);
    }
}