第一版
==================================
透過 ViewModel，使用API服務，從網路擷取經濟部水庫水情的資料
詳見:https://reurl.cc/QEnDZq

第二版
==================================
1. 讓Composable直接取得ViewModel中的資料，不再透過MainActivity聯繫UI(Composable)和UI的狀態(ViewModel)。  
2. 在ViewModel中定義Composable的狀態，狀態只有三種，Success、Error、Loading，使用密封類定義這三個狀態。  
3. ViewModel只有唯一一個屬性，代表對應UI的狀態，這個狀態只有那三種可能的值，
   其中只有Success狀態的裡面，具有從網路擷取而來的資料。  
