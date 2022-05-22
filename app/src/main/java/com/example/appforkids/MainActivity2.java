package com.example.appforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.ByteArrayOutputStream;
import java.io.File;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        e = findViewById(R.id.e);
        f = findViewById(R.id.f);
        g = findViewById(R.id.g);
        h = findViewById(R.id.h);
        i = findViewById(R.id.i);
        j = findViewById(R.id.j);
        k = findViewById(R.id.k);
        l = findViewById(R.id.l);
        m = findViewById(R.id.m);
        n = findViewById(R.id.n);
        o = findViewById(R.id.o);
        p = findViewById(R.id.p);
        q = findViewById(R.id.q);
        r = findViewById(R.id.r);
        s = findViewById(R.id.s);
        t = findViewById(R.id.t);
        u = findViewById(R.id.u);
        v = findViewById(R.id.v);
        w = findViewById(R.id.w);
        x = findViewById(R.id.x);
        y = findViewById(R.id.y);
        z = findViewById(R.id.z);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.a:
                Intent intent = new Intent(this, MainActivity3.class);
                intent.putExtra("text", "A");
                intent.putExtra("picture", R.drawable.afor);
                startActivity(intent);
                break;
            case R.id.b:
                Intent intentb = new Intent(this, MainActivity3.class);
                intentb.putExtra("text", "B");
                intentb.putExtra("picture", R.drawable.bfor);
                startActivity(intentb);
                break;
            case R.id.c:
                Intent intentc = new Intent(this, MainActivity3.class);
                intentc.putExtra("text", "C");
                intentc.putExtra("picture", R.drawable.cfor);
                startActivity(intentc);
                break;
            case R.id.d:
                Intent intentd = new Intent(this, MainActivity3.class);
                intentd.putExtra("text", "D");
                intentd.putExtra("picture", R.drawable.dfor);
                startActivity(intentd);
                break;
            case R.id.e:
                Intent intente = new Intent(this, MainActivity3.class);
                intente.putExtra("text", "E");
                intente.putExtra("picture", R.drawable.efor);
                startActivity(intente);
                break;
            case R.id.f:
                Intent intentf = new Intent(this, MainActivity3.class);
                intentf.putExtra("text", "F");
                intentf.putExtra("picture", R.drawable.ffor);
                startActivity(intentf);
                break;
            case R.id.g:
                Intent intentg = new Intent(this, MainActivity3.class);
                intentg.putExtra("text", "G");
                intentg.putExtra("picture", R.drawable.gfor);
                startActivity(intentg);
                break;
            case R.id.h:
                Intent intenth = new Intent(this, MainActivity3.class);
                intenth.putExtra("text", "H");
                intenth.putExtra("picture", R.drawable.hfor);
                startActivity(intenth);
                break;
            case R.id.i:
                Intent intenti = new Intent(this, MainActivity3.class);
                intenti.putExtra("text", "I");
                intenti.putExtra("picture", R.drawable.ifor);
                startActivity(intenti);
                break;
            case R.id.j:
                Intent intentj = new Intent(this, MainActivity3.class);
                intentj.putExtra("text", "J");
                intentj.putExtra("picture", R.drawable.jfor);
                startActivity(intentj);
                break;
            case R.id.k:
                Intent intentk = new Intent(this, MainActivity3.class);
                intentk.putExtra("text", "K");
                intentk.putExtra("picture", R.drawable.kfor);
                startActivity(intentk);
                break;
            case R.id.l:
                Intent intentl = new Intent(this, MainActivity3.class);
                intentl.putExtra("text", "L");
                intentl.putExtra("picture", R.drawable.lfor);
                startActivity(intentl);
                break;
            case R.id.m:
                Intent intentm = new Intent(this, MainActivity3.class);
                intentm.putExtra("text", "M");
                intentm.putExtra("picture", R.drawable.mfor);
                startActivity(intentm);
                break;
            case R.id.n:
                Intent intentn = new Intent(this, MainActivity3.class);
                intentn.putExtra("text", "N");
                intentn.putExtra("picture", R.drawable.nfor);
                startActivity(intentn);
                break;
            case R.id.o:
                Intent intento = new Intent(this, MainActivity3.class);
                intento.putExtra("text", "O");
                intento.putExtra("picture", R.drawable.ofor);
                startActivity(intento);
                break;
            case R.id.p:
                Intent intentp = new Intent(this, MainActivity3.class);
                intentp.putExtra("text", "P");
                intentp.putExtra("picture", R.drawable.pfor);
                startActivity(intentp);
                break;
            case R.id.q:
                Intent intentq = new Intent(this, MainActivity3.class);
                intentq.putExtra("text", "Q");
                intentq.putExtra("picture", R.drawable.qfor);
                startActivity(intentq);
                break;
            case R.id.r:
                Intent intentr = new Intent(this, MainActivity3.class);
                intentr.putExtra("text", "R");
                intentr.putExtra("picture", R.drawable.rfor);
                startActivity(intentr);
                break;
            case R.id.s:
                Intent intents = new Intent(this, MainActivity3.class);
                intents.putExtra("text", "S");
                intents.putExtra("picture", R.drawable.sfor);
                startActivity(intents);
                break;
            case R.id.t:
                Intent intentt = new Intent(this, MainActivity3.class);
                intentt.putExtra("text", "T");
                intentt.putExtra("picture", R.drawable.tfor);
                startActivity(intentt);
                break;
            case R.id.u:
                Intent intentu = new Intent(this, MainActivity3.class);
                intentu.putExtra("text", "U");
                intentu.putExtra("picture", R.drawable.ufor);
                startActivity(intentu);
                break;
            case R.id.v:
                Intent intentv = new Intent(this, MainActivity3.class);
                intentv.putExtra("text", "V");
                intentv.putExtra("picture", R.drawable.vfor);
                startActivity(intentv);
                break;
            case R.id.w:
                Intent intentw = new Intent(this, MainActivity3.class);
                intentw.putExtra("text", "W");
                intentw.putExtra("picture", R.drawable.wfor);
                startActivity(intentw);
                break;
            case R.id.x:
                Intent intentx = new Intent(this, MainActivity3.class);
                intentx.putExtra("text", "X");
                intentx.putExtra("picture", R.drawable.xfor);
                startActivity(intentx);
                break;
            case R.id.y:
                Intent intenty = new Intent(this, MainActivity3.class);
                intenty.putExtra("text", "Y");
                intenty.putExtra("picture", R.drawable.yfor);
                startActivity(intenty);
                break;
            case R.id.z:
                Intent intentz = new Intent(this, MainActivity3.class);
                intentz.putExtra("text", "Z");
                intentz.putExtra("picture", R.drawable.zfor);
                startActivity(intentz);
                break;
        }
    }
}