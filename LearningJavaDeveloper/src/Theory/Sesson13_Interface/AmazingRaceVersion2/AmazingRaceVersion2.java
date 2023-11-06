package Theory.Sesson13_Interface.AmazingRaceVersion2;

import Theory.Sesson13_Interface.Data.*;
import org.jetbrains.annotations.NotNull;

import java.util.*;


public class AmazingRaceVersion2{
    public static void main(String[] args) {
        runToDead();
    }

    public static void PlayAnonymous(){
//        List list = new ArrayList();
        //abstract, interface đó, 20 hàm không có code !!
        List list1 = new List() { //Anonymous -> Phải viết tới 20 hàm abstract
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @NotNull
            @Override
            public Iterator iterator() {
                return null;
            }

            @NotNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean addAll(@NotNull Collection c) {
                return false;
            }

            @Override
            public boolean addAll(int index, @NotNull Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public Object set(int index, Object element) {
                return null;
            }

            @Override
            public void add(int index, Object element) {

            }

            @Override
            public Object remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @NotNull
            @Override
            public ListIterator listIterator() {
                return null;
            }

            @NotNull
            @Override
            public ListIterator listIterator(int index) {
                return null;
            }

            @NotNull
            @Override
            public List subList(int fromIndex, int toIndex) {
                return null;
            }

            @Override
            public boolean retainAll(@NotNull Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(@NotNull Collection c) {
                return false;
            }

            @Override
            public boolean containsAll(@NotNull Collection c) {
                return false;
            }

            @NotNull
            @Override
            public Object[] toArray(@NotNull Object[] a) {
                return new Object[0];
            }
        };
    }
    public static void runToDead(){
        // Có quyền có Anonymous: Ai đó chạy ngang nhảy vô
        // MỸ NHÂN NGỮ CỦA CHÂU TINH TRÌ NHẢY VÀO!!!
        // Người cá đúng chuẩn - class Mermaid thì chuyên ngồi mỏm đá, dụ thủy thủ đến bắt ăn thịt
        // Viết code bình thường, code này có hàm bắt thủy thủ và anThit()
        // bắt Mermaid implement DeathRacer, bắt người cá di chuyển là quá đáng
        // Không phù hợp logic, người cá không thích di chuyển đi đua

         /* Nhưng có 1 nàng người cá thích ăn chay, lên bờ chơi với người, không theo logic chung của người cá là ăn thịt
        người thủy thủ, là obj lẻ không nhập chung đoàn Mermaid truyền thống. Vậy ta không thể bắt Mermaid implements
        DeathRacer.
            Mỹ nhân ngư của Châu Tinh Trì phá đoàn, tham gia đua dưới kênh Nhiêu Lộc cho vui, không bắt cả họ người cá đi
            đua
            -> Obj đánh lẻ, đánh lẻ đua, thì chỉ cần đua tốc độ là được rồi.
            -> Anonymous class, không thèm tạo class rời mà vẫn tham gia clb, chỉ cần có hành động của clb là oke, ghé
            ngang thôi thì cũng phải hành động -> implements all abstract methods ON-THE-GO, take-away*/
         /*làm Class riêng rẻ để nhân bản nhiều member
         làm on the go dành cho vãng lai ghé ngang
         -> Cả 2 đều phải implements, @Override vì CHA, CLB không hoàn hảo*/
        // Obj ON-THE-GO, chỉ cần hàm đua và gáy thành tích là xong, không làm class rời, không làm class sẵn để nhân bản
//        DeathRacer myNhaNguChauTinhTri = new Mermaid(...) -> class rời này sẽ có @Override 2 hàm runToDead(), showHowToDead()

       /* Mượn gió bẻ măng, không có khuôn sẵn thì phải @Override từ đầu,
         cho mỗi lần chơi làm biếng tạo khuôn, ON-THE-GO @Override*/
        DeathRacer myNhaNguChauTinhTri = new DeathRacer() {
            // VÙNG KHÔNG GIAN  CỦA CLASS MERMAID MÀ TA LÀM BIẾNG LÀM RIÊNG
            // VÙNG NÀY CHÍNH LÀ PHẦN MỞ RỘNG CỦA CHA/CLB
            // BA SẼ LÀ CÁNH CHIM (new/super() new DeadRacer), đưa con extends/implements thật xa, thật nhiều @Override
            // ta có quyền làm như truyền thống, thêm đặc điểm, ...
            // đừng làm dụng, ON-THE-GO thì nên quan tâm phần đang tham gia

            public static final double MAX_SPEED = 50.0;
            @Override
            public double runToDead() {
                return new Random().nextDouble() * MAX_SPEED * 3;
            }
            // Anonymous làm biếng tạo class rời cho cả abstract và interface
            // Bên abstract class thì ta còn đặc điểm của CHA cho để xài
            // Anonymous của Interface, đua thì đua đi, hỏi han làm gì, không có infor
            @Override
            public void showHowToDead() {
                System.out.printf("|%-20s|%-15s|    2015|     -     |%5.1f|\n","MERMAID-RACER","Mỹ Nhân Ngư",runToDead());
            }
        }; //VIP

        Dog d1 = new Dog("NGÁO ĐÁ", 2001, 5);
        // Chấm full code hàm con, đủ code hàm cha, clb
        Pet d2 = new Dog("VÀNG ƠI", 1950, 3);
        // chấm full hàm Cha, chạy cũng không sợ vì đa hình, con qua mặt
        // tổ lái con trỏ được, new Dog mà sợ gì
        DeathRacer d3 = new Dog("NANH TRẮNG", 1901, 20);
        // Chấm chỉ sổ full clb, hàm runToDead() và showHowToDead
        // Chạy k sợ vì đa hình, con qua mặt
        // Ép con trỏ được luôn, new Dog mà sợ gì

        Motor m1 = new Motor("Exciter", "150.0cm3", "58F8-22204");
        DeathRacer m2 = new Motor("Exciter", "150.0cm3", "56F6-67889");

        /* Mỹ nhân ngư là một DeadRacer, có hành động đua gấp 3 lần giới hạn vật lý của người cá, em xứng đáng gia nhập
        * clb đua, vào lane đua*/
        DeathRacer racer[] = {d1, (Dog)d2, d3, m1, m2, myNhaNguChauTinhTri};
        /* Tất cả là DeadRacer, đa hình là đa hình trên runToDead(), showHowToDead().
        * Con tự lo, con Motor chạy theo Motor, con Dog chạy theo Dog*/
        for (DeathRacer x: racer
             ) {
            x.showHowToDead();
        }
    }
}
