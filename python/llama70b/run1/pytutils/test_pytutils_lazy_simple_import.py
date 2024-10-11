import unittest
from pytutils.lazy.simple_import import _LazyModuleMarker, NonLocal, make_lazy


class Test_LazyModuleMarker(unittest.TestCase):
    def test_init(self):
        marker = _LazyModuleMarker()
        self.assertIsInstance(marker, _LazyModuleMarker)

class Test_NonLocal(unittest.TestCase):
    def test_init(self):
        non_local = NonLocal(42)
        self.assertEqual(non_local.value, 42)

    def test_slots(self):
        non_local = NonLocal(42)
        self.assertRaises(AttributeError, setattr, non_local, 'foo', 42)

class Test_LazyModule(unittest.TestCase):
    def test_mro(self):
        lazy_module = make_lazy('module_path')
        self.assertEqual(type(lazy_module).__mro__, (type(LazyModule), type(ModuleType))

    def test_getattribute(self):
        lazy_module = make_lazy('module_path')
        module_path = 'module_path'
        import sy
        sys_modules[module_path] = lazy_module
        self.assertIsNone(lazy_module.__getattribute__('module').value)
        lazy_module.__getattribute__('attr')
        self.assertIsNotNone(lazy_module.__getattribute__('module').value)

    def test_private_methods(self):
        lazy_module = make_lazy('module_path')
        self.assertRaises(AttributeError, getattr, lazy_module, '__ LazyModule__private_method')

class Test_make_lazy(unittest.TestCase):
    def test_make_lazy(self):
        lazy_module = make_lazy('module_path')
        from module import LazyModule

if __name__ == '__main__':
    unittest.main()