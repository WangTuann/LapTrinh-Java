/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quang Tuan
 */
public class DoanSo {
    public static void main(String[] args) {
    int score ;  // điểm khởi tạo = 5
    int soCuaMay, soNguoiChoiDoan;
    String ketQua = "";
    Scanner scanner = new Scanner(System.in);
     
    // Nếu bạn để điều kiện lặp là true 
    // thì vòng lặp while sẽ chạy đến khi 
    // biểu thức if có từ khóa break được thực thi
        System.out.println("Nhap so lan du doan");
        score=sc.nextInt();
    while (true) {
        Random rd = new Random();
        // số máy ra được random từ 1 đến 5
        soCuaMay = 1 + rd.nextInt(100);
 
        System.out.print("Mời bạn đoán số: ");
        soNguoiChoiDoan = scanner.nextInt();
             
        if (soNguoiChoiDoan != soCuaMay) {
            ketQua = "==> Bạn đoán sai!";
            System.out.println(ketQua);
            score--;
        } else {
            ketQua = "==> Bạn đoán đúng!";
            System.out.println(ketQua);
            score++;
        }
 
        if (score == 0) {
            System.out.println("Game Over!");
            break;
        } 
             
        if (score >0||score <=5 ) {
            System.out.println("Congratulations! You Win!");
            break;
        }
    }
}

    private static class Random {

        public Random() {
        }

        private int nextInt(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
