package org.rust.lang.core.types

import org.rust.lang.core.psi.*
import org.rust.lang.core.types.util.resolvedType

abstract class RustStructOrEnumTypeBase(struct: RustStructOrEnumItemElement) : RustType {

    override val inherentImpls: Sequence<RustImplItemElement> by lazy {
        struct.containingMod?.impls.orEmpty().asSequence()
            .filter { it.type?.resolvedType == this }
    }

}
