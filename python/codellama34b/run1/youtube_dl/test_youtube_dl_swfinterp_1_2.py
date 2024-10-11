import unittest
from youtube_dl.swfinterp import _read_int



class Test_u32(unittest.TestCase):
    def test_u32(self):
        result = _u32(1)
        self.assertEqual(result, 1)

class Test_read_int(unittest.TestCase):
    def test_read_int(self):
        result = _read_int(1)
        self.assertEqual(result, 1)

class Test_read_uint(unittest.TestCase):
    def test_read_uint(self):
        result = _read_uint(1)
        self.assertEqual(result, 1)

class Test_read_double(unittest.TestCase):
    def test_read_double(self):
        result = _read_double(1)
        self.assertEqual(result, 1)

class Test_read_string(unittest.TestCase):
    def test_read_string(self):
        result = _read_string(1)
        self.assertEqual(result, 1)

class Test_read_namespace(unittest.TestCase):
    def test_read_namespace(self):
        result = _read_namespace(1)
        self.assertEqual(result, 1)

class Test_read_ns_set(unittest.TestCase):
    def test_read_ns_set(self):
        result = _read_ns_set(1)
        self.assertEqual(result, 1)

class Test_read_multiname(unittest.TestCase):
    def test_read_multiname(self):
        result = _read_multiname(1)
        self.assertEqual(result, 1)

class Test_read_multiname_set(unittest.TestCase):
    def test_read_multiname_set(self):
        result = _read_multiname_set(1)
        self.assertEqual(result, 1)

class Test_read_method_info(unittest.TestCase):
    def test_read_method_info(self):
        result = _read_method_info(1)
        self.assertEqual(result, 1)

class Test_read_metadata_info(unittest.TestCase):
    def test_read_metadata_info(self):
        result = _read_metadata_info(1)
        self.assertEqual(result, 1)

class Test_read_instance_info(unittest.TestCase):
    def test_read_instance_info(self):
        result = _read_instance_info(1)
        self.assertEqual(result, 1)

class Test_read_class_info(unittest.TestCase):
    def test_read_class_info(self):
        result = _read_class_info(1)
        self.assertEqual(result, 1)

class Test_read_script_info(unittest.TestCase):
    def test_read_script_info(self):
        result = _read_script_info(1)
        self.assertEqual(result, 1)

class Test_read_method_body_info(unittest.TestCase):
    def test_read_method_body_info(self):
        result = _read_method_body_info(1)
        self.assertEqual(result, 1)

class Test_read_abc_file(unittest.TestCase):
    def test_read_abc_file(self):
        result = _read_abc_file(1)
        self.assertEqual(result, 1)

class Test_read_abc_file_from_stream(unittest.TestCase):
    def test_read_abc_file_from_stream(self):
        result = _read_abc_file_from_stream(1)
        self.assertEqual(result, 1)

class Test_read_abc_file_from_bytes(unittest.TestCase):
    def test_read_abc_file_from_bytes(self):
        result = _read_abc_file_from_bytes(1)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()