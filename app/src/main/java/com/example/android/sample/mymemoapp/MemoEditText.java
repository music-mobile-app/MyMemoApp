package com.example.android.sample.mymemoapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by wnish on 2017/06/06.
 */

public class MemoEditText extends EditText{
    //ビットマスク
    //直線
    private static final int SOLID = 1;
    //破線
    private static final int DASH = 2;
    //通常の太さ
    private static final int NORMAL = 4;
    //太線
    private static final int BOLD = 8;

    //このViewの横幅
    private int mMeasuredWidth;
    //1行の高さ
    private int mDisplayLineCount;

    //罫線のパス
    private Path mPath;
    //「どのように描画するか」を保存する。
    private Paint mPaint;

    public MemoEditText(Context context) {
        this(context, null);
    }

    public MemoEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        //初期設定
        init(context,attrs);
    }
    public MemoEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //初期設定
        init(context, attrs);
    }
    //初期設定を行う。
    //インスタンスの生成などをonDraw()内で行うべきではない。
    private void init(Context context, AttributeSet attrs) {
        //Pathは、複数の直線や曲線などの情報をカプセル化する。
        mPath = new Path();
        //Paintは、「どのように描画するか」という情報を保持する。
        mPaint = new Paint();

        //Paint.Style.STROKEは塗りつぶしなしで、輪郭線を描画するスタイル
        mPaint.setStyle(Paint.Style.STROKE);

        //インスタンス生成時に、属性情報が渡されていない場合
        //かつ、Android Studioのプレビュー表示ではない場合
        if (attrs != null && !isInEditMode()) {
            //属性情報を取得
            int lineEffectBit;
            int lineColor;

            Resources resources = context.getResources();
            TypeArray typeArray = context.obtainStyledAttributes(attrs, R.styleable.MemoEditText);

        }

    }


}
