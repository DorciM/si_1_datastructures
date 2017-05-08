/**
 * Created by doramedgyasszay on 2017. 04. 30..
 */
public class HashMap {

    private Entry table[] = new Entry[size];
    private static final int size = 16;

    private int getIndex(int hashedKey){
        return hashedKey & (size-1);
    }

    public void put(Object key, Object value){
        Entry newEntry = new Entry(key, value);
        int hashedKey = key.hashCode();
        int index = getIndex(hashedKey);

        if (table[index] == null){
            table[index] = newEntry;
        } else {
            Entry temp = table[index];
            while (temp.getNext() != null){
                if (temp.getKey().equals(key)){
                    temp.setValue(newEntry.getValue());
                    return;
                }
                temp = temp.getNext();
            }
            temp.setNext(newEntry);
        }

    }


    public Object get(Object key){
        int hashedKey = key.hashCode();
        int index = getIndex(hashedKey);
        Entry entry = table[index];

        while (entry != null){
            if (entry.getKey().equals(key)){
                return entry.getValue();
            }
            entry = entry.getNext();
            }
            return null;
        }



    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        Entry entry1 = new Entry(100, "Valami");
        Entry entry2 = new Entry(230, "megint");
        Entry entry3 = new Entry(33, "sztpéter");
        Entry entry4 = new Entry(98, "lucifer");
        Entry entry5 = new Entry(98, "lucifer");

        hashMap.put(entry1, "valahol");
        hashMap.put(entry2, "máshol");
        hashMap.put(entry4, "ide");
        hashMap.put(entry5, "oda");
        Object object = hashMap.get(entry5);
        System.out.println("Get element value: " + object );
        System.out.println(hashMap.get(entry1));

    }
}
