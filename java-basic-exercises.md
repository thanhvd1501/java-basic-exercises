# Danh sách 50 Bài Tập Java

## PHẦN 1 --- BÀI TẬP CƠ BẢN (20 bài)

**Bài 1: Kiểm tra số chẵn lẻ**\
**Đề bài:** Nhập một số nguyên `n`, in "Even" nếu n chẵn, ngược lại
"Odd".\
**Gợi ý:** `n % 2 == 0`.\
**Ví dụ:** Input: `5` → Output: `Odd`.

**Bài 2: So sánh hai số**\
**Đề bài:** Nhập `a, b`. In số lớn hơn hoặc "Equal" nếu bằng nhau.\
**Gợi ý:** if-else nhiều nhánh.\
**Ví dụ:** `3 9` → `9`.

**Bài 3: Điểm trung bình & xếp loại**\
**Đề bài:** Nhập 3 điểm; tính trung bình; xếp loại: `>=8.5 Giỏi`,
`>=6.5 Khá`, `>=5 Trung bình`, `<5 Yếu`.\
**Gợi ý:** if-else bậc thang.\
**Ví dụ:** `7 8 9` → `avg=8.0, Khá`.

**Bài 4: Năm nhuận**\
**Đề bài:** Nhập năm; in "Leap" nếu nhuận, ngược lại "Common".\
**Gợi ý:** Năm nhuận: chia hết 400 hoặc (chia hết 4 và không chia hết
100).\
**Ví dụ:** `2000` → `Leap`.

**Bài 5: Switch -- Tên ngày trong tuần**\
**Đề bài:** Nhập số 1..7; in "Monday..Sunday".\
**Gợi ý:** `switch-case + default`.\
**Ví dụ:** `3` → `Wednesday`.

**Bài 6: Switch -- Số ngày của tháng**\
**Đề bài:** Nhập tháng 1..12; in số ngày (không xét năm nhuận).\
**Gợi ý:** gộp case 1,3,5,7,8,10,12 → 31; 4,6,9,11 → 30; 2 → 28.\
**Ví dụ:** `4` → `30`.

**Bài 7: For -- In 1..N**\
**Đề bài:** Nhập `N`; in các số từ 1 đến N trên một dòng.\
**Ví dụ:** `5` → `1 2 3 4 5`.

**Bài 8: For -- Tổng 1..N**\
**Đề bài:** Tính `S = 1 + 2 + … + N`.\
**Gợi ý:** biến cộng dồn.\
**Ví dụ:** `5` → `15`.

**Bài 9: For -- Bảng cửu chương**\
**Đề bài:** Nhập số 2..9; in bảng nhân 1..10.\
**Ví dụ:** Input: `7` → Output: `7 x 1 = 7 … 7 x 10 = 70`.

**Bài 10: While -- Đếm ngược**\
**Đề bài:** Nhập `N`; in `N, N-1, …, 1`.\
**Ví dụ:** `4` → `4 3 2 1`.

**Bài 11: Do-while -- Nhập số dương**\
**Đề bài:** Yêu cầu nhập số dương; nếu nhập sai, yêu cầu nhập lại đến
khi đúng.\
**Ví dụ:** Input: `-3, 0, 5` → Output cuối: `5`.

**Bài 12: Tính giai thừa**\
**Đề bài:** Nhập `n (0..12)`, tính `n!`.\
**Gợi ý:** for/while; chú ý `0! = 1`.\
**Ví dụ:** `5` → `120`.

**Bài 13: Tính lũy thừa**\
**Đề bài:** Nhập `a, b (b >= 0)`, tính `a^b` bằng vòng lặp.\
**Ví dụ:** `2 10` → `1024`.

**Bài 14: Đếm chữ số của số nguyên dương**\
**Đề bài:** Nhập `n>0`; in số lượng chữ số.\
**Gợi ý:** chia 10 liên tiếp.\
**Ví dụ:** `12345` → `5`.

**Bài 15: Tổng các chữ số**\
**Đề bài:** Nhập `n>=0`; tính tổng các chữ số của n.\
**Ví dụ:** `1234` → `10`.

**Bài 16: Kiểm tra số nguyên tố (đơn giản)**\
**Đề bài:** Nhập `n>=2`; kiểm tra prime bằng thử chia 2..n-1.\
**Ví dụ:** `11` → `Prime`.

**Bài 17: In dãy số chẵn 0..N**\
**Đề bài:** Nhập `N`; in các số chẵn ≤ N.\
**Ví dụ:** `10` → `0 2 4 6 8 10`.

**Bài 18: Tính trung bình cộng của M số thực**\
**Đề bài:** Nhập `M`, sau đó nhập M số thực; in trung bình.\
**Gợi ý:** dùng for.\
**Ví dụ:** `3` và `1.5 2.5 3.0` → `2.3333`.

**Bài 19: In tam giác sao đặc**\
**Đề bài:** Nhập `h`; in tam giác vuông cạnh h bằng ký tự `*`.\
**Gợi ý:** 2 vòng lặp lồng.\
**Ví dụ (h=3):**

    *
    **
    ***

**Bài 20: Do-while -- Menu đơn giản**\
**Đề bài:** Hiển thị menu: `1. Hello`, `2. Today`, `0. Exit`. Lặp lại
đến khi chọn 0.\
**Gợi ý:** do-while + switch.

------------------------------------------------------------------------

## PHẦN 2 --- BÀI TẬP KẾT HỢP (20 bài)

**Bài 21: Đếm số chẵn & lẻ trong 1..N**\
... (rút gọn trong ví dụ code, toàn bộ nội dung vẫn giữ như trả lời
trước)

------------------------------------------------------------------------

## PHẦN 3 --- NÂNG CAO & MẢNG ĐỐI TƯỢNG (10 bài)

**Bài 41: Bảng cửu chương 2D**\
... (tương tự cho đến Bài 50)
