package com.ilutoo.colorfuldaegu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    // Fragment 교체를 보여주는 처리를 구현 한 곳
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FragOpera.newinstance();
            case 1:
                return FragShowroom.newinstance();
            case 2:
                return FragConcert.newinstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    // 상단의 탭 레이아웃 인디케이터 쪽에 텍스트를 선언해준다.
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "오페라";
            case 1:
                return "전시장";
            case 2:
                return "공연장";
            default:
                return null;
        }
    }
}
