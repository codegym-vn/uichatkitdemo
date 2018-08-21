# uichatkitdemo
Thiết kế giao diện màn hình chat sử dụng RelativeLayout
#### Khởi tạo layout
<br />
Mã nguồn uichatkitdemo được sử dụng để thực hành tại [CodeGym](https://codegym.vn)
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.codegym.uichatkitdemo.MainActivity">

    <android.support.v7.widget.RecyclerView
        android:id="@+id/rvMesseage"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_above="@+id/ctnEdtBox"
        />

    <RelativeLayout
        android:id="@+id/ctnEdtBox"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:padding="3dp">

        <ImageView
            android:id="@+id/btnSendMsg"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentRight="true"
            android:padding="4dp"
            android:src="@android:drawable/ic_menu_send"
            />

        <EditText
            android:id="@+id/edtChatBox"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_toLeftOf="@+id/btnSendMsg"
            android:hint="Nhập tin nhắn"
            />
    </RelativeLayout>

</RelativeLayout>

```
#### Khởi tạo item messeage layout gửi đi
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginLeft="24dp"
    android:layout_marginBottom="8dp"
    android:layout_marginTop="8dp">

    <TextView
        android:id="@+id/tvMsgConent"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="@drawable/shape_bg_outgoing_bubble"
        android:paddingLeft="24dp"
        android:paddingBottom="12dp"
        android:gravity="center"
        android:paddingTop="12dp"
        android:textSize="16sp"
        android:paddingRight="34dp"
        android:layout_alignParentRight="true"
        android:textColor="#fff"
        android:text="Hi"
        />
</RelativeLayout>
```
#### Khởi tạo item messeage layout gửi đến
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginBottom="8dp"
    android:layout_marginRight="24dp"
    android:layout_marginTop="8dp">

    <TextView
        android:id="@+id/tvMsgConent"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="@drawable/shape_bg_incoming_bubble"
        android:gravity="center"
        android:paddingBottom="12dp"
        android:paddingLeft="24dp"
        android:paddingRight="34dp"
        android:paddingTop="12dp"
        android:text="Hi"
        android:textColor="#fff"
        android:textSize="16sp"
        />
</RelativeLayout>
```

<br />
Mã nguồn  được sử dụng để thực hành tại [CodeGym](https://codegym.vn)
