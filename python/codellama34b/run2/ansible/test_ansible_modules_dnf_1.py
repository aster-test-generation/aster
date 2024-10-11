import unittest
from ansible.modules.dnf import *



class TestDnf(unittest.TestCase):
    def test_main(self):
        instance = DNF()
        result = instance.main()
        self.assertEqual(result, None)

    def test_run_command_dnf(self):
        instance = DNF()
        result = instance.run_command_dnf()
        self.assertEqual(result, None)

    def test_run_command_yum(self):
        instance = DNF()
        result = instance.run_command_yum()
        self.assertEqual(result, None)

    def test_run_command_rpm(self):
        instance = DNF()
        result = instance.run_command_rpm()
        self.assertEqual(result, None)

    def test_run_command_yum_dnf(self):
        instance = DNF()
        result = instance.run_command_yum_dnf()
        self.assertEqual(result, None)

    def test_run_command_rpm_dnf(self):
        instance = DNF()
        result = instance.run_command_rpm_dnf()
        self.assertEqual(result, None)

    def test_run_command_yum_dnf_rpm(self):
        instance = Dnf()
        result = instance.run_command_yum_dnf_rpm()
        self.assertEqual(result, None)

    def test_run_command_rpm_dnf_yum(self):
        instance = Dnf()
        result = instance.run_command_rpm_dnf_yum()
        self.assertEqual(result, None)

    def test_run_command_yum_rpm_dnf(self):
        instance = Dnf()
        result = instance.run_command_yum_rpm_dnf()
        self.assertEqual(result, None)

    def test_run_command_dnf_yum_rpm(self):
        instance = Dnf()
        result = instance.run_command_dnf_yum_rpm()
        self.assertEqual(result, None)

    def test_run_command_dnf_rpm_yum(self):
        instance = Dnf()
        result = instance.run_command_dnf_rpm_yum()
        self.assertEqual(result, None)

    def test_run_command_rpm_yum_dnf(self):
        instance = DNF()
        result = instance.run_command_rpm_yum_dnf()
        self.assertEqual(result, None)

    def test_run_command_dnf_rpm(self):
        instance = DNF()
        result = instance.run_command_dnf_rpm()
        self.assertEqual(result, None)

    def test_run_command_yum_dnf_rpm(self):
        instance = DNF()
        result = instance.run_command_yum_dnf_rpm()
        self.assertEqual(result, None)

    def test_run_command_rpm_dnf_yum(self):
        instance = DNF()
        result = instance.run_command_rpm_dnf_yum()
        self.assertEqual(result, None)

    def test_run_command_yum_rpm_dnf(self):
        instance = DNF()
        result = instance.run_command_yum_rpm_dnf()
        self.assertEqual(result, None)

    def test_run_command_dnf_yum_rpm(self):
        instance = DNF()
        result = instance.run_command_dnf_yum_rpm()
        self.assertEqual(result, None)

    def test_run_command_dnf_rpm_yum(self):
        instance = DNF()
        result = instance.run_command_dnf_rpm_yum()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()