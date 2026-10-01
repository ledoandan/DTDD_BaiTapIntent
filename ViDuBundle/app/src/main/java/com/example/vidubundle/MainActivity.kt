package com.example.vidubundle

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vidubundle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Khai báo biến binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Khởi tạo ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Sự kiện khi bấm nút "Gửi"
        binding.btnSend.setOnClickListener {
            // 1. Tạo Bundle chứa dữ liệu
            val bundle = Bundle()
            bundle.putString("KEY_MESSAGE", "Xin chào, đây là dữ liệu từ Màn hình 1!")
            bundle.putInt("KEY_NUMBER", 2026)

            // 2. Tạo Intent trỏ đến SecondActivity
            val intent = Intent(this, SecondActivity::class.java)

            // 3. Đưa Bundle vào Intent
            intent.putExtras(bundle)

            // 4. Mở màn hình 2
            startActivity(intent)
        }
    }
}