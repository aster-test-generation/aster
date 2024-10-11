import unittest
from pytutils.lazy.simple_import import _LazyModuleMarker, NonLocal, make_lazy


class Test_LazyModuleMarker(unittest.TestCase):
    def test_init(self):
        instance = _LazyModuleMarker()
        self.assertIsInstance(instance, _LazyModuleMarker)

class Test_NonLocal(unittest.TestCase):
    def test_init(self):
        instance = NonLocal(42)
        self.assertIsInstance(instance, NonLocal)
        self.assertEqual(instance.value, 42)

    def test_slots(self):
        instance = NonLocal(42)
        self.assertRaises(AttributeError, setattr, instance, 'foo', 'bar')

class Test_LazyModule(unittest.TestCase):
    def test_mro(self):
        lazy_module = make_lazy('some.module.path')
        self.assertEqual(type(lazy_module).__mro__, (type(LazyModule), type(ModuleType))

    def test_getattribute(self):
        lazy_module = make_lazy('some.module.path')
        module_path = 'some.module.path'
        import sy
        sys_modules[module_path] = lazy_module
        self.assertIsNone(lazy_module.__getattribute__('value'))
        lazy_module.__getattribute__('some_attr')
        self.assertIsNotNone(lazy_module.__getattribute__('value'))

    def test_private_getattribute(self):
        lazy_module = make_lazy('some.module.path')
        module_path = 'some.module.path'
        import sys
        sys_modules[module_path] = lazy_module
        self.assertIsNone(lazy_module._LazyModule__getattribute__('value'))
        lazy_module._LazyModule__getattribute__('some_attr')
        self.assertIsNotNone(lazy_module._LazyModule__getattribute__('value'))

    def test_str_method(self):
        lazy_module = make_lazy('some.module.path')
        self.assertEqual(str(lazy_module), '<module \'some.module.path\' (lazy)>')

    def test_repr_method(self):
        lazy_module = make_lazy('some.module.path')
        self.assertEqual(repr(lazy_module), 'module \'some.module.path\' (lazy)'

class Test_make_lazy(unittest.TestCase):
    def test_make_lazy(self):
        lazy_module = make_lazy('some.module.path')
        self.assertIsInstance(lazy_module, LazyModule)

if __name__ == '__main__':
    unittest.main()