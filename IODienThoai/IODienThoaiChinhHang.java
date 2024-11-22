package IODienThoai;

import Model.DienThoaiChinhHang;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IODienThoaiChinhHang {

    private static final String PATH = "src/Data/DienThoaiChinhHang";

    public static List<DienThoaiChinhHang> ConvertToListDienThoaiChinhHang() {
        List<DienThoaiChinhHang> list = new ArrayList<>();
        try (
                FileReader fileReader = new FileReader(PATH);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

        ) {
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                String[] arrData = temp.split(",");
                list.add(new DienThoaiChinhHang(
                        Integer.parseInt(arrData[0].trim()),
                        arrData[1].trim(),
                        arrData[2].trim(),
                        arrData[3].trim(),
                        arrData[4].trim(),
                        LocalDate.parse(arrData[5]),
                        arrData[6].trim()
                        ));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void saveDienThoaiChinhHang(DienThoaiChinhHang dienThoaiChinhHang) {
        try (
                FileWriter fileWriter = new FileWriter(PATH, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        ) {
            bufferedWriter.write(dienThoaiChinhHang.convertToLine());
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveToListDienThoaiChinhHang(List<DienThoaiChinhHang> list) {
        try (
                FileWriter fileWriter = new FileWriter(PATH);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            for(DienThoaiChinhHang dienThoaiChinhHang : list) {
bufferedWriter.write(dienThoaiChinhHang.convertToLine());
bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}