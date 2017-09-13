/*
 * Copyright (c) 2012-2017 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.machine.server.event;

import org.eclipse.che.mutiuser.permissions.machine.recipe.RecipeImpl;
import org.eclipse.che.core.db.cascade.event.RemoveEvent;

/**
 * Pre-removal event of {@link RecipeImpl}.
 *
 * @author Max Shaposhnik
 */
public class BeforeRecipeRemovedEvent extends RemoveEvent {
  private final RecipeImpl recipe;

  public BeforeRecipeRemovedEvent(RecipeImpl recipe) {
    this.recipe = recipe;
  }

  public RecipeImpl getRecipe() {
    return recipe;
  }
}
