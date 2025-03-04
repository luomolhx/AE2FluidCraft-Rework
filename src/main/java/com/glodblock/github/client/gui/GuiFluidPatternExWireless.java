package com.glodblock.github.client.gui;

import net.minecraft.entity.player.InventoryPlayer;

import appeng.container.slot.AppEngSlot;
import appeng.container.slot.SlotDisabled;

import com.glodblock.github.inventory.item.IWirelessTerminal;

public class GuiFluidPatternExWireless extends GuiFluidPatternTerminalEx {

    public GuiFluidPatternExWireless(InventoryPlayer inventoryPlayer, IWirelessTerminal te) {
        super(inventoryPlayer, te);
    }

    @Override
    protected void repositionSlot(final AppEngSlot s) {
        if (s instanceof SlotDisabled || s.isPlayerSide()) {
            s.yDisplayPosition = s.getY() + this.ySize - 78 - 5;
        } else {
            s.yDisplayPosition = s.getY() + this.ySize - 78 - 3;
        }
    }
}
