package View;

import Lib.InputHelper;
import Model.MeoAnhLongDai;
import Model.MeoAnhLongNgan;
import Model.MeoBaTu;
import Model.MeoNga;
import Services.AppService;

public class AppMenu {
    private AppService appService;

    public AppMenu() {
        appService = new AppService();
        menu();
    }

    private void menu() {
        System.out.println("\n--------------------Quản lý mèo cho mẹ----------------------------");
        System.out.println("1.Thêm mèo.");
        System.out.println("2.Xóa Mèo theo ID.");
        System.out.println("3.Hiển thị toàn bộ mèo.");
        System.out.println("4.Hiển thị mèo theo ID.");
        System.out.println("5.Thay đổi tiếng kêu theo ID.");
        System.out.println("6.Thoát chương trình.");
        int req = InputHelper.inputNumber("Nhap lua chon: ", "Sai kieu du lieu");
        controller(req);
    }

    private void subMenu() {
        System.out.println("-----------Chon loai meo----------");
        System.out.println("1. Mèo Nga");
        System.out.println("2. Mèo Ba Tư");
        System.out.println("3. Mèo Anh Lông Dài");
        System.out.println("4. Mèo Anh Lông Ngắn");
        int select = InputHelper.inputNumber("Nhap lựa chọn: ", "Sai kiểu dữ liệu");
        subController(select);
    }

    private void controller(int req) {
        switch (req) {
            case 1:
                subMenu();
                break;
            case 2:
                appService.delete(InputHelper.inputNumber("Nhap id: ", "Sai kieu du lieu"));
                break;
            case 3:
                appService.displayAll();
                break;
            case 4:
                appService.displayById(InputHelper.inputNumber("Nhap id: ", "Sai kieu du lieu"));
                break;
            case 5:
                appService.update(InputHelper.inputNumber("Nhap id: ", "Sai kieu du lieu"), InputHelper.inputString("Nhap tieng keu moi: ", "Do dai khong dung", 0, 100));
                break;
            default:
                System.exit(0);
        }
        menu();
    }

    private void subController(int select) {
        switch (select) {
            case 1:
                appService.add(new MeoNga());
                break;
            case 2:
                appService.add(new MeoBaTu());
                break;
            case 3:
                appService.add(new MeoAnhLongDai());
                break;
            case 4:
                appService.add(new MeoAnhLongNgan());
                break;
            default:
                System.exit(0);
        }
    }

}
