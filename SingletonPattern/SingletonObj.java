package SingletonPattern;
// Lazy Intialization
// public class SingletonObj {
    
//     private SingletonObj obj=null;
//     SingletonObj(){
//         System.out.println("Class created");
//     }
//     public SingletonObj getInstance(){
//         // Lazy initialization
//         if(obj == null){
//             obj= new SingletonObj();
//         }

//         return obj;
//     }
// }

// Eager Initialization
// public class SingletonObj {
    
//     private SingletonObj obj=new SingletonObj();
//     SingletonObj(){
//         System.out.println("Class created");
//     }
//     public SingletonObj getInstance(){
       

//         return obj;
//     }
// }
//Single Locking
// public class SingletonObj {
    
//     private SingletonObj obj=new SingletonObj();
//     SingletonObj(){
//         System.out.println("Class created");
//     }
//     public synchronized SingletonObj getInstance(){
       
//         if(obj == null){
//             obj= new SingletonObj();
//         }
//         return obj;
//     }
// }
//Double Locking
public class SingletonObj {
    
    private static SingletonObj obj=new SingletonObj();
    SingletonObj(){
        System.out.println("Class created");
    }
    public static synchronized SingletonObj getInstance(){
       
        if(obj == null){
             synchronized(SingletonObj.class){
                if(obj == null){
                    obj = new SingletonObj();
                    return obj;
                }

            }
            
        }
        return obj;
    }
}



