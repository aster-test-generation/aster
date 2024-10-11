import unittest
from youtube_dl.swfinterp import _read_in


class TestUndefined(unittest.TestCase):
    def test_init(self):
        instance = _Undefined()
        self.assertIsInstance(instance, _Undefined)

    def test_bool(self):
        instance = _Undefined()
        self.assertFalse(bool(instance))

    def test_hash(self):
        instance = _Undefined()
        self.assertEqual(hash(instance), 0)

    def test_str(self):
        instance = _Undefined()
        self.assertEqual(str(instance), 'undefined')

class TestAVMClass(unittest.TestCase):
    def test_init(self):
        instance = _AVMClass('(no name idx)', 'String')
        self.assertIsInstance(instance, _AVMClass)

    def test_name(self):
        instance = _AVMClass('(no name idx)', 'String')
        self.assertEqual(instance.name, '(no name idx)')

class TestStringClass(unittest.TestCase):
    def test_init(self):
        instance = StringClass
        self.assertIsInstance(instance, _AVMClass)

    def test_name(self):
        instance = StringClass
        self.assertEqual(instance.name, '(no name idx)')

class TestByteArrayClass(unittest.TestCase):
    def test_init(self):
        instance = ByteArrayClass
        self.assertIsInstance(instance, _AVMClass)

    def test_name(self):
        instance = ByteArrayClass
        self.assertEqual(instance.name, '(no name idx)')

class TestTimerClass(unittest.TestCase):
    def test_init(self):
        instance = TimerClass
        self.assertIsInstance(instance, _AVMClass)

    def test_name(self):
        instance = TimerClass
        self.assertEqual(instance.name, '(no name idx)')

class TestTimerEventClass(unittest.TestCase):
    def test_init(self):
        instance = TimerEventClass
        self.assertIsInstance(instance, _AVMClass)

    def test_name(self):
        instance = TimerEventClass
        self.assertEqual(instance.name, '(no name idx)')

    def test_timer(self):
        instance = TimerEventClass
        self.assertEqual(instance.timer, 'timer')

if __name__ == '__main__':
    unittest.main()