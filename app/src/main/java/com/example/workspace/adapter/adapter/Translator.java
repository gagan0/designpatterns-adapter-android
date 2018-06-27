package com.example.workspace.adapter.adapter;

import com.example.workspace.adapter.implementations.GaganSir;
import com.example.workspace.adapter.implementations.Krishnendu;

/**
 * Created by Workspace on 6/27/2018.
 */

public class Translator extends Krishnendu
{
    GaganSir gaganSir;
    public Translator(GaganSir gaganSir)
    {
        this.gaganSir = gaganSir;
    }
    public String speak()
    {
        return gaganSir.speak();
    }
}
