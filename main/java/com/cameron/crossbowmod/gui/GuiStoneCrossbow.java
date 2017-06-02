package com.cameron.crossbowmod.gui;


import com.cameron.crossbowmod.Ref;
import com.cameron.crossbowmod.container.ContainerStoneCrossbow;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

public class GuiStoneCrossbow extends GuiContainer{
	// Height and width of actual image
    public static final int WIDTH = 175;
    public static final int HEIGHT = 160;

    // Location of the gui
    private static final ResourceLocation background = new ResourceLocation(Ref.MODID, "textures/gui/stone_crossbow_gui.png");

    public GuiStoneCrossbow(ContainerStoneCrossbow container) {
        super(container);
    }

    // Called to draw the gui
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(background);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, WIDTH, HEIGHT);
    }
}
