package com.example.vidubundle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vidubundle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    // Khai báo biến binding riêng cho màn hình 2
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Khởi tạo ViewBinding cho màn hình 2
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1. Lấy Bundle (Extras) từ Intent gửi đến
        val bundle = intent.extras

        // 2. Kiểm tra xem Bundle có null hay không
        if (bundle != null) {
            // Lấy dữ liệu ra theo đúng Key đã cài ở Màn hình 1
            val receivedMessage = bundle.getString("KEY_MESSAGE")
            val receivedNumber = bundle.getInt("KEY_NUMBER")

            // Gán chữ lên TextView để hiển thị
            binding.tvDisplayInfo.text = "Lời nhắn: $receivedMessage \nNăm: $receivedNumber"
        }

        // 3. Sự kiện bấm nút Quay lại
        binding.btnBack.setOnClickListener {
            // Gọi finish() để hủy màn hình 2, tự động trở về màn hình 1
            finish()
        }
    }
}