import bangun3d.PrismaSegitiga;

public class Main {
    public static void main(String[] args) {
        try {
            PrismaSegitiga prisma1 = new PrismaSegitiga(null, 10);
            System.out.println(prisma1);
            System.out.println(prisma1.getVolume());
            System.out.println(prisma1.getDetailAlas());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
