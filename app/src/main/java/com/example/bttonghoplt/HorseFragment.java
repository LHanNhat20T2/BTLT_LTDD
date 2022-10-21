package com.example.bttonghoplt;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import com.example.bttonghoplt.HorseModel.Horse;
import com.example.bttonghoplt.HorseModel.HorseAdapter;


public class HorseFragment extends Fragment  {
     ListView listView;
     ArrayList<Horse> horseList;
     HorseAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lv_horse,container,false);

        listView= view.findViewById(R.id.listview_horse);
        horseList = new ArrayList<>();
        horseList.add(new Horse("Ngựa bạch","Một con ngựa bạch tốt và chuẩn là con ngựa đó cần có mắt thau đồng, móng trắng.","80$",R.drawable.img_nguabach6));
        horseList.add(new Horse("Ngựa bạch","Một con ngựa bạch tốt và chuẩn là con ngựa đó cần có mắt thau đồng, móng trắng.","80$",R.drawable.img_nguabach));
        horseList.add(new Horse("Ngựa bạch","Một con ngựa bạch tốt và chuẩn là con ngựa đó cần có mắt thau đồng, móng trắng.","80$",R.drawable.img_nguabach4));
        horseList.add(new Horse("Ngựa ô","Ngựa đen hay còn gọi là ngựa ô.Thân màu đen và đuôi đen, phần dưới tứ chi cũng đều là màu đen.","80$",R.drawable.img_nguaden));
        horseList.add(new Horse("Ngựa bạch","Một con ngựa bạch tốt và chuẩn là con ngựa đó cần có mắt thau đồng, móng trắng.","80$",R.drawable.img_nguavang));
        horseList.add(new Horse("Ngựa thuần chuẩn","Ngựa Thuần Chủng như đầu nhẹ, 4 chân dài, chân trước luôn có sự cong khớp xương bẩm sinh. ","80$",R.drawable.img_nguabachma));
        horseList.add(new Horse("Cỏ","Cỏ xanh làm thức ăn cho ngựa ","80$",R.drawable.img_co));
        horseList.add(new Horse("Thức ăn ngựa Kruse","Thức ăn cho ngựa Kruse’s Perfection Brand Rice Bran Meal Horse Food.","80$",R.drawable.eatkruse));
        horseList.add(new Horse("Thức ăn cho ngựa Maxwin","Thức ăn cho ngựa MaxWin Electrolyte. Thành phần: cỏ các loại, tinh bột, chất béo, chất xơ và protein.","80$",R.drawable.eatmaxwin));
        horseList.add(new Horse("Thức ăn hỗn hợp","Thức ăn cho ngựa Electrolyte. Thành phần: cỏ các loại, tinh bột, chất béo, chất xơ và protein.","80$",R.drawable.mixeat));
        horseList.add(new Horse("Yên ngựa","Yên là cấu trúc nâng đỡ cho người cưỡi hay vật tải khác, đeo trên lưng động vật.","80$",R.drawable.img_vatdung1));
        horseList.add(new Horse("Roi quất ngựa"," Ngựa được làm bằng chất liệu Da PU, bền hơn. Tay cầm có thiết kế chống trượt.","80$",R.drawable.img_vatdung2));
        horseList.add(new Horse("Mũ cưỡi ngựa","Mũ bảo hiểm cưỡi ngựa Màu sắc: đen Loại sản phẩm: đồ dùng cho người cưỡi ngựa.","80$",R.drawable.img_vatdung3));
        horseList.add(new Horse("Móng ngựa","Được làm từ chất liệu hợp kim nhôm cao cấp, chắc chắn, bền và có tuổi thọ cao.","80$",R.drawable.img_vatdugn4));
        horseList.add(new Horse("Áo giáp cưỡi ngựa","Bảo hộ cơ thể này được làm từ những tấm mút xốp đục lỗ tạo độ thông thoáng cho người mặc.","80$",R.drawable.img_vatdung5));
        adapter= new HorseAdapter(getContext(),R.layout.item_horse,horseList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(),MoTa.class);
                intent.putExtra("anh",horseList.get(i).getImgOrder());
                intent.putExtra("ten",horseList.get(i).getNameOrder());
                intent.putExtra("mota",horseList.get(i).getDescOrder());
                intent.putExtra("gia",horseList.get(i).getPrinceOrder());
                startActivity(intent);
            }
        });

        return view;
    }
}