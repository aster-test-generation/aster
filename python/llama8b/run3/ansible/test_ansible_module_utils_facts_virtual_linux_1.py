import unittest
from ansible.module_utils.facts.virtual.linux import LinuxVirtualCollecto


class TestLinuxVirtual(unittest.TestCase):
    def test_init(self):
        instance = LinuxVirtual()
        self.assertEqual(instance.__class__, LinuxVirtual)

    def test_str_method(self):
        instance = LinuxVirtual()
        result = instance.__str__()
        self.assertEqual(result, str(instance))

    def test_repr_method(self):
        instance = LinuxVirtual()
        result = instance.__repr__()
        self.assertEqual(result, repr(instance))

    def test_eq_method(self):
        instance1 = LinuxVirtual()
        instance2 = LinuxVirtual()
        self.assertEqual(instance1, instance2)

    def test_get_file_content(self):
        instance = LinuxVirtual()
        file_path = '/path/to/file'
        content = instance.get_file_content(file_path)
        self.assertEqual(content, get_file_content(file_path))

    def test_get_file_lines(self):
        instance = LinuxVirtual()
        file_path = '/path/to/file'
        lines = instance.get_file_lines(file_path)
        self.assertEqual(lines, get_file_lines(file_path))

    def test_virtual_method(self):
        instance = LinuxVirtual()
        result = instance.virtual()
        self.assertEqual(result, VirtualCollector())

if __name__ == '__main__':
    unittest.main()